var Employee = /** @class */ (function () {
    function Employee(employeeId, employeeName, maritalStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.maritalStatus = maritalStatus;
    }
    Employee.prototype.employeeInfo = function () {
        console.log("Employee Id: " + this.employeeId);
        console.log("Employee Name: " + this.employeeName);
        console.log("Employee Gender: " + this.maritalStatus);
    };
    return Employee;
}());
var employee = new Employee(1122, "Amitab", true);
employee.employeeInfo();
