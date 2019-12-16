export interface vehicleItem
{
    id?:number;
    name:string;
    image:string;
    vehicle_no:string;
    seater:string;
    type:string;
    price:number;
    active:boolean;
    branch:String;
    insurance_exp_date:Date;
    last_service_date:Date;
    service_due_date:Date;
    status?:boolean;
}