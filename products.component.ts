import { Component, OnInit } from '@angular/core';
import {LoginService} from './../login/login.service'
import { ProductService } from './products.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  public UserName="";
  p1 :any;
  p2 :any;
  p3 :any;
  shoppingList :any[];


  constructor(private loginService:LoginService,private productService:ProductService) {   
   }

  ngOnInit() {
    this.p1 ={ id :1 , username : this.loginService.globalVarUserName, name:'Apple-laptop',category:'Electronics',brand:'Apple',price:50000};
    this.p2 ={ id :2 ,username:this.loginService.globalVarUserName,name:'Hand Bhag',category:'clothing',brand:'Woodland',price:500};
    this.p3 = { id :3,username:this.loginService.globalVarUserName,name:'Kitchen Apron',category:'kitchen cloths',price:150};
   
  
  }
  onProductAddedToCart(productType:string)  {
    if(productType=='product1'){
        this.productService.SaveProductToCart(this.p1).subscribe((result)=>{
        console.log(result);
      });
    }
    if(productType=='product2'){
      this.productService.SaveProductToCart(this.p2).subscribe((result)=>{
        console.log(result);
      });
    }
    if(productType=='product3'){
      this.productService.SaveProductToCart(this.p3).subscribe((result)=>{
        console.log(result);
      });
    }

    
    alert("Product added to cart");
    console.log(this.shoppingList);
  }
 
}
