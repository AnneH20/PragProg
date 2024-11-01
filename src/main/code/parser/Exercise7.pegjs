// Time Parser Grammar
// ==========================
//
// BNF
// <time> ::= <hour> ":" <minute> <digit> | <hour> <ampm> | <hour> ":" <minute> <digit> <ampm>
// <hour> ::= 0 <digit> | 1 <digit> | 2 <digit> | <digit>
// <minute> ::= 0 <digit> | 1 <digit> | 2 <digit> | 3 <digit>| 4 <digit> | 5 <digit>
// <digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
// <ampm> ::= "am" | "pm"
//
// ============================
// Accepts expressions like 4pm, 7:38pm, 23:42, 3:16, 3:16am.

time
  = hour:hour ampm:ampm              		{ return hour + ampm }
  / hour:hour ":" minute:minute ampm:ampm 	{ return hour + minute + ampm }
  / hour:hour ":" minute:minute             { return hour + minute }

ampm
  = "am" { return 0 }
  / "pm" { return 12*60 }

hour
  = hour:hour_tens{ return hour * 60 }
  / hour:digit           { return hour * 60 }

minute
  = minute_tens:[0-5] digit:digit { return parseInt(minute_tens + digit, 10); }

digit
  = digit:[0-9] { return parseInt(digit, 10); }

hour_tens
  = twelve_hour:[01] digit:digit { return parseInt(twelve_hour + digit, 10); }
  / twenty_four_hour:[2]  d2:[0-3]  { return parseInt(twenty_four_hour + d2, 10); }