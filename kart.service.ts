import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import  {getCartUserUrl } from './../url';

@Injectable({
    providedIn: 'root'
  })
  export class KartService{

    constructor(public http: HttpClient){  
    }
        
    GetOrderByUserName(userName:string):Observable<any>{        
        var result = this.http.get(getCartUserUrl + '/' + userName );
        return result;
    }
   
  }