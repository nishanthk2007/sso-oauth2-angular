import { Component, OnInit } from '@angular/core';
import {BikeService} from "../../services/bike.service";
import {Observable} from "rxjs";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html'
})
export class ViewRegistrationComponent implements OnInit {

  public bikeReg;

  constructor(private bikeService: BikeService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getBikeReg(this.route.snapshot.params.id)
  }

  getBikeReg(id){
    this.bikeService.getBike(id).subscribe(
      data => {this.bikeReg = data; console.log(this.bikeReg);},
      error => Observable.throw(error),
      () => console.log("bike loaded")
    )
  }
}
