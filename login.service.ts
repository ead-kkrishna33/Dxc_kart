import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of, Observer} from 'rxjs';
import  {validateUserUrl } from './../url';

@Injectable({
    providedIn: 'root'
  })
  export class LoginService{
     globalVarUserName :string;
     globalVarUserNameChange : Observable<string>;
     globalVarUserNameObserver:Observer<string>;

    constructor(public http: HttpClient){
      this.globalVarUserNameChange = new Observable((observer:Observer<string>)=>{
        this.globalVarUserNameObserver =observer;
      });
    }
       
    updateGlobalVarUSerName(newValue:string) {
      this.globalVarUserName = newValue;
      this.globalVarUserNameObserver.next(this.globalVarUserName);
    }

    validateUser(userDetails:any):Observable<any>{
        console.log("Hello");        
        var result = this.http.post(validateUserUrl, userDetails );
        return result;
    }

    SaveUser(userDetails:any):Observable<any>{  
      //  console.log(userDetails);
        var result = this.http.post(validateUserUrl, userDetails);
        return result;
    
      }
  }