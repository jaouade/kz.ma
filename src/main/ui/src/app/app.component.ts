import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
export class Image {
  id: number;
  link: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  IMAGES;

  // Inject HttpClient into your component or service.
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    // Make the HTTP request:
    this.http.get('/images').subscribe((data) => {
      // Read the result field from the JSON response.
      this.IMAGES = data;


    });
  };
  title = 'Tour of Heroes';
  images = this.IMAGES;
  selectedImage: Image;
  onSelect(img: Image): void {
    this.selectedImage = img;
  }
}

