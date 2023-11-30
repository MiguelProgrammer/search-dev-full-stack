import { Analyst } from './../../services/interfaces/analyst';
import { Component, Input, OnInit } from '@angular/core';
import { AnalystService } from 'src/app/services/analyst.service';

@Component({
  selector: 'app-cabecalho',
  templateUrl: './cabecalho.component.html',
  styleUrls: ['./cabecalho.component.css']
})
export class CabecalhoComponent implements OnInit {

  title = 'search-dev-front';

  ngOnInit(): void {
  }

  constructor(private analystService:AnalystService){
  }
}

