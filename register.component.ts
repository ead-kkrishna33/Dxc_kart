import { Component, OnInit } from '@angular/core';
import {RegisterService } from './register.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  Username:string;
  Password:string;
  Confirm:string;
  Email_id:string
  Contact:string;
  errMsg :string;
  user :any;
  responseMsg :string;
 
  constructor(private registerService : RegisterService){
}

ngOnInit(): void {
  this.Username = "";
  this.Password ="";
 this.Confirm="";
 this.Email_id="";
 this.Contact ="";
this.errMsg ="";
this.responseMsg ="";
this.user = null;

}

  OnSubmit(){
          var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
          // console.log(this.Username);
          // console.log(this.Password);
          // console.log(this.Confirm);
          // console.log(this.Email_id);
          // console.log(this.Contact);
          if(this.Password !== this.Confirm) {
          this.errMsg="password miss match";                   
          }
          if(this.Username.length < 6){
            this.errMsg="please enter user name of minimum 6 characters";
          }
          if(this.Password.length <6){
            this.errMsg="Please enter password of minimum 6 characters";
          }
          if (reg.test(this.Email_id) == false) 
          {
              this.errMsg='Invalid Email Address';
              return (false);
          }
          if(this.Contact.length < 10){
            this.errMsg="Please enter 10 phone digit no.";
        }
        if(this.errMsg==""){
       
          this.registerService.GetUserByUserName(this.Username).subscribe((result) => { 
            if(result.username != this.Username){
              //  console.log("hello");
               var userInfo ={username:this.Username,password:this.Password,email:this.Email_id,phoneNo:this.Contact};
                 this.registerService.SaveUser(userInfo).subscribe((res)=>{
                    if(res==true){
                      this.responseMsg =" You are registered successfully. Please login."
                    } 
                    else{
                      this.responseMsg ="Error Occured !!!"
                    }
                  });

                }
            else{
              this.errMsg="User already exist. Please choose different user name";
            }
        });
          
      }
  }


}