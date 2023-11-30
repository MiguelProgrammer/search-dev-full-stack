import { Analyst } from './../../../services/interfaces/analyst';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnalystService } from 'src/app/services/analyst.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  analyst: Analyst = {
    pId: 0,
    actuation: "",
    stack: ""
  };

  constructor(
    private analystService: AnalystService,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit(): void {

    const pId = this.route.snapshot.paramMap.get('pId');
    if (pId != null) {
      this.analystService.getByPid(parseInt(pId!)).subscribe((analyst) => {
        this.analyst = analyst
      })
    }
  }

  update(pId: number) {
    this.analystService.update(this.analyst).subscribe(() => {
      this.router.navigate(["/analyst/all"])
    })
  }
}
