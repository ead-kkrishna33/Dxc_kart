import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable  } from 'rxjs';
import { saveOrderUrl } from '../url';


@Injectable({
    providedIn: 'root'
  })
  export class ProductService{
      
      constructor(private http:HttpClient){
       
      }
      SaveProductToCart(order:any):Observable<any>{
        console.log(order);
        var result=this.http.post(saveOrderUrl,order);
        return result;

      }
  }