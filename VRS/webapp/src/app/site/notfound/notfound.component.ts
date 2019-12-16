import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notfound',
  template: `<div>
    <p>
      Page you are looking for, does not exist.
    </p>
    </div>
  `,
  styles: [`.page{
    color:red;

  }`]
})
export class NotfoundComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
