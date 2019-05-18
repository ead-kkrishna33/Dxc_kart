import { Component, OnInit } from '@angular/core';
import { KartService } from './kart.service';
import { LoginService } from '../login/login.service';


@Component({
  selector: 'app-kart',
  templateUrl: './kart.component.html',
  styleUrls: ['./kart.component.css']
})
export class KartComponent implements OnInit {
  orders:any;
  totalprice :number =0;
  constructor(private loginService : LoginService,private kartService: KartService) { }

  ngOnInit() {
    this.kartService.GetOrderByUserName(this.loginService.globalVarUserName).subscribe((result)=>{
   this.orders = result;
   for(var i=0; i< this.orders.length;i++)
   {
    this.totalprice = this.totalprice + parseInt(this.orders[i].price);
   }
    });
  }

}
