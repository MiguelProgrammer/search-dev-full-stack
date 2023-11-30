import { Analyst } from './../../../services/interfaces/analyst';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnalystService } from 'src/app/services/analyst.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  listAnalyst: Analyst[] = [];
  analyst: Analyst = {
    pId: 0,
    actuation: "",
    stack: ""
  };

  editAnalist!: Analyst

  constructor(
    private analystService: AnalystService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.analystService.getAll().subscribe((listAnalyst) => {
      this.listAnalyst = listAnalyst;
    });

    const pId = this.route.snapshot.paramMap.get('pId');
    if (pId != null) {
      this.analystService.getByPid(parseInt(pId!)).subscribe((analy) => {
        this.analyst = analy
        this.editAnalist = this.analyst
      })
    }
  }

  delete(pId: number) {
    this.analystService.delete(pId).subscribe(() => {
      this.router.navigate(["/analyst/all"])
    });
  }

  create() {
    this.analystService.create(this.analyst).subscribe(() => {
      this.router.navigate(["/analyst/all"])
    });
  }


}
