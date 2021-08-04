function spinalCase(str) {
    let replacedWhiteSpaceStr=str.replace(/_([A-Z])/g, " ")
    .trim().toLowerCase()
    .split(" ").join("-")
    console.log( replacedWhiteSpaceStr)
    return replacedWhiteSpaceStr;
}
spinalCase(" Coder of Delta did this ");