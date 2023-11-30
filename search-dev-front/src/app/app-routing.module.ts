import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { ListComponent } from './componentes/analyst/list/list.component';
import { CreateComponent } from './componentes/analyst/create/create.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'analyst/all', component: ListComponent},
  {path: 'analyst/create', component: CreateComponent},
  {path: 'analyst/update/:pId', component: CreateComponent},
  {path: 'analyst/:pId/delete', component: ListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
