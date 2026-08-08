function trigger() {
  alert("Welcome to XYZ bank !!!");
}

function validateCustomer() {
  var custId = document.getElementById("custID").value;
  var validateCust = custId.includes("XYZ");

  if (validateCust) {
    document.getElementById("result").innerHTML =
      "Customer ID is valid, you can proceed further.";
  } else {
    document.getElementById("result").innerHTML =
      "You are not a valid customer.";
  }
}

function generateCoupon() {
  var custId = document.getElementById("custID").value;
  var couponCode = custId + "789456";
  var validateCust = custId.includes("XYZ");

  if (validateCust) {
    document.getElementById("result").innerHTML =
      "Your coupon is: " + couponCode;
  } else {
    document.getElementById("result").innerHTML =
      "Invalid customer ID, so coupon can't be generated.";
  }
}