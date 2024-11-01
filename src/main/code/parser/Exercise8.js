function timeParser(time) {
    let hour, minute, ampm;

    const withMinutes = /^(\d{1,2}):([0-5]\d)(am|pm)?$/i;
    const withoutMinutes = /^(\d{1,2})(am|pm)?$/i;

    if (withMinutes.test(time)) {
        const match = time.match(withMinutes);
        hour = parseInt(match[1], 10);
        minute = parseInt(match[2], 10);
        ampm = match[3] ? match[3].toLowerCase() : '';

        if (ampm === 'pm' && hour !== 12) {
            hour += 12;
        }
        else if (ampm === 'am' && hour === 12) {
            hour = 0;
        }
    }
    else if (withoutMinutes.test(time)) {
        const match = time.match(withoutMinutes);
        hour = parseInt(match[1], 10);
        minute = 0;
        ampm = match[2] ? match[2].toLowerCase() : '';

        if (ampm === 'pm' && hour !== 12) {
            hour += 12;
        }
        else if (ampm === 'am' && hour === 12) {
            hour = 0;
        }
    }
    else {
        throw new Error('Error parsing time: ${time}');
    }
    return hour * 60 + minute;
}

const testTime = ["4pm", "7:38pm", "23:42", "3:16", "3:16pm"]
testTime.forEach(time => {
    const minutes = timeParser(time);
    console.log(`${time} is ${minutes} minutes past midnight.`)
})