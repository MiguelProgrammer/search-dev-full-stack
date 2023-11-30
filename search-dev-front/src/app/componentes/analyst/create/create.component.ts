import { Component, OnInit } from '@angular/core';
import { AnalystService } from 'src/app/services/analyst.service';
import { Analyst } from '../../../services/interfaces/analyst';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  analyst: Analyst = {
    pId: 0,
    actuation: "",
    stack: ""
  }

  constructor(
    private analystService: AnalystService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    const pId = this.route.snapshot.paramMap.get('pId');
    if (pId != null) {
      this.analystService.getByPid(parseInt(pId!)).subscribe((analy) => {
        this.analyst = analy
      })
    }
  }

  create() {
    this.analystService.create(this.analyst).subscribe(() => {
      this.router.navigate(["/analyst/all"])
    });
  }


}
