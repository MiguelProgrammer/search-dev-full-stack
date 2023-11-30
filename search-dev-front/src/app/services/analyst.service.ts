import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, retry } from 'rxjs';
import { Analyst } from './interfaces/analyst';

@Injectable({
  providedIn: 'root'
})
export class AnalystService {

  private readonly API = "";

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Analyst[]> {
    console.log("Method: getAll")
    return this.httpClient.get<Analyst[]>('/analyst/all')
  }

  create(analyst: Analyst): Observable<Analyst> {
    console.log("Method: create", analyst)
    return this.httpClient.post<Analyst>("/analyst/create",analyst)
  }

  delete(pId: number): Observable<Analyst> {
    console.log("Method: delete", pId)
    return this.httpClient.get<Analyst>(`analyst/${pId}/delete`)
  }

  getByPid(pId: number): Observable<Analyst> {
    console.log("Method: getByPid", pId)
    return this.httpClient.get<Analyst>(`/analyst/${pId}`)
  }

  update(analyst: Analyst): Observable<Analyst> {
    console.log("Method: update")
    return this.httpClient.put<Analyst>("/analyst/update", analyst)
  }

}

