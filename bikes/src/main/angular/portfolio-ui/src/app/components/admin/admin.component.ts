import { Component, OnInit } from '@angular/core';
import {BikeService} from "../../services/bike.service";

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html'
})
export class AdminComponent implements OnInit {
  public bikes;

  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    this.getBikes();
  }

  getBikes(){
    this.bikeService.getBikes().subscribe(
      data => {this.bikes = data; console.log(this.bikes);},
      err => console.error(err),
      () =>console.log('bikes loaded')
    )
  }

}
