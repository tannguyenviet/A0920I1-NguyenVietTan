const ID_REGEX=/SV\w{2}-\d{4}/;
const PHONE_REGEX=/090\d{7}|091\d{7}|\(84\)\+91\d{7}|\(84\)\+90\d{7}/;
const CMND_REGEX=/\d{9}/;
const EMAIL_REGEX =   /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
const NUMBER_REGEX =/^[1-9]\d*$/;
const NUMBER_DECIMAL =/^(\d*\.)?\d+$/;

function validateCMND(cmnd){
    return CMND_REGEX.test(cmnd);
}
function validateNumber(number){
    return NUMBER_REGEX.test(number);
}
function validateEmail(email){
    return EMAIL_REGEX.test(email)
}
function validateDecimalNumber(number){
    return NUMBER_DECIMAL.test(number);
}
function validatePhone(phoneNumber){
    return PHONE_REGEX.test(phoneNumber);
}