class Employee{
    employeeId:number;
    employeeName:string;
    maritalStatus:boolean;

    constructor(employeeId:number,employeeName:string,maritalStatus:boolean){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.maritalStatus=maritalStatus;
    }

    employeeInfo():void{
        console.log("Employee Id: "+this.employeeId);
        console.log("Employee Name: "+this.employeeName);
        console.log("Employee Gender: "+this.maritalStatus);
    }
}

let employee=new Employee(1122,"Amitab",true);
employee.employeeInfo();