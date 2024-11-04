// runs Peggy parser

const parser = require('./timeParser');

const userInput = process.argv[2];

if (!userInput) {
    console.error("Please provide input to parse. Usage: node run timeParser -- \"3:16pm\" ");
    process.exit(1);
}

try {
    const result = parser.parse(userInput);
    console.log("Minutes past midnight:", result);
} catch (e) {
    console.error("Parsing error:", e.message);
}
