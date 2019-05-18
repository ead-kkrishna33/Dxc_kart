import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import  {getUserUrl, addUserUrl } from './../url';

@Injectable({
    providedIn: 'root'
  })
export class RegisterService{ 
    constructor(public http: HttpClient){
    }

    GetUserByUserName(userName:string):Observable<any>{        
        var result = this.http.get(getUserUrl + '/' + userName );
        return result;
    }

    SaveUser(userDetails:any):Observable<any>{  
      //  console.log(userDetails);
        var result = this.http.post(addUserUrl, userDetails);
        return result;
    }
}