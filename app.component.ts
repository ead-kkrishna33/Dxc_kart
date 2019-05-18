import { Component } from '@angular/core';
import {LoginService} from './login/login.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My-dxc-shopping-kart';
 public globalUserName="";
   constructor(private loginService:LoginService){
     this.loginService.globalVarUserNameChange.subscribe((data)=> {
       this.globalUserName = data;
      // console.log(this.globalUserName);   
      });
   }
  }

