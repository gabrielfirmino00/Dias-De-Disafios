let displayValue = "";
let operator = "";
let operand = null;

function updateDisplay() {
  const display = document.getElementById("display");
  display.value = displayValue;
}

function clearDisplay() {
  displayValue = "";
  operator = "";
  operand = null;
  updateDisplay();
}

function appendNumber(number) {
  displayValue += number;
  updateDisplay();
}

function appendOperator(op) {
  if (operator !== "") {
    calculate();
  }
  operator = op;
  operand = parseFloat(displayValue);
  displayValue = "";
}

function calculate() {
  const display = document.getElementById("display");
  const currentOperand = parseFloat(displayValue);
  let result;

  switch (operator) {
    case "+":
      result = operand + currentOperand;
      break;
    case "-":
      result = operand - currentOperand;
      break;
    case "*":
      result = operand * currentOperand;
      break;
    case "/":
      result = operand / currentOperand;
      break;
    default:
      return;
  }

  displayValue = result.toString();
  operator = "";
  operand = null;
  updateDisplay();
}

updateDisplay();
