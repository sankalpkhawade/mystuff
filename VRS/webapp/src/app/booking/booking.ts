import { vehicleItem } from "../vehicle/item-info/vehicleItem";

export interface Booking{
    id?:number;
    bookingStart:Date;
    bookingEnd:Date;
    price?:number;
    vehicle?:vehicleItem[];
}