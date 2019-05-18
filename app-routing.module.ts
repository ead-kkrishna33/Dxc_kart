import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { KartComponent } from './kart/kart.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ProductsComponent } from './products/products.component';

// For MDB Angular Free

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path:'login',  component: LoginComponent},
  {path:'register',  component: RegisterComponent},
  {path:'kart',  component: KartComponent},
  {path:'products', component:ProductsComponent},
 // {path: '', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
  
})
export class AppRoutingModule { }
