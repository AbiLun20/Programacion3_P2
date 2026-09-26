import {Component, signal} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-validar-acceso',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './validar-acceso.html',
  styleUrl: './validar-acceso.scss',
  })
export class ValidarAcceso{
  edad: number | null = null;
  pago: boolean = false;
}

