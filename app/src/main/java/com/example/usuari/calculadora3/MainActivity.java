package com.example.usuari.calculadora3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcularsuma(View v){
    EditText edtNumero=(EditText)this.findViewById(R.id.edtNumero1);
    EditText edtNumero2=(EditText)this.findViewById(R.id.edtNumero2);
    TextView tvResultado=(TextView)this.findViewById(R.id.tvResultado);
    int num=Integer.parseInt(edtNumero.getText().toString());
    int num2=Integer.parseInt(edtNumero2.getText().toString());
    Intent intent=new Intent(this,ResultActivity.class);
    intent.putExtra("resultado",num+num2);
    this.startActivity(intent);
}
    public void calcularesta(View v){
        EditText edtNumero=(EditText)this.findViewById(R.id.edtNumero1);
        EditText edtNumero2=(EditText)this.findViewById(R.id.edtNumero2);
        TextView tvResultado=(TextView)this.findViewById(R.id.tvResultado);
        int num=Integer.parseInt(edtNumero.getText().toString());
        int num2=Integer.parseInt(edtNumero2.getText().toString());
        //Intent intent=new Intent(this,ResultActivity.class);
        //intent.putExtra("resultado",num-num2);
        //this.startActivity(intent);
        Toast.makeText(this,"El resultado es "+(num-num2), Toast.LENGTH_LONG).show();
    }
    public void calcularmulti(View v){
        EditText edtNumero=(EditText)this.findViewById(R.id.edtNumero1);
        EditText edtNumero2=(EditText)this.findViewById(R.id.edtNumero2);
        TextView tvResultado=(TextView)this.findViewById(R.id.tvResultado);
        int num=Integer.parseInt(edtNumero.getText().toString());
        int num2=Integer.parseInt(edtNumero2.getText().toString());
       //Intent intent=new Intent(this,ResultActivity.class);
        //intent.putExtra("resultado",num*num2);
       // this.startActivity(intent);
        AlertDialog.Builder cuadro = new
                AlertDialog.Builder(this);
        cuadro.setMessage("El resultado es: "+(num*num2));
        cuadro.setPositiveButton(android.R.string.yes,null);
        //cuadro.setNegativeButton(android.R.string.no, null);
        cuadro.show();
    }
    public void calculardivision(View v){
        EditText edtNumero=(EditText)this.findViewById(R.id.edtNumero1);
        EditText edtNumero2=(EditText)this.findViewById(R.id.edtNumero2);
        TextView tvResultado=(TextView)this.findViewById(R.id.tvResultado);
        int num=Integer.parseInt(edtNumero.getText().toString());
        int num2=Integer.parseInt(edtNumero2.getText().toString());
        //Intent intent=new Intent(this,ResultActivity.class);
        //intent.putExtra("resultado",num/num2);
       // this.startActivity(intent);
        AlertDialog.Builder cuadro = new
                AlertDialog.Builder(this);
        cuadro.setMessage("El resultado es: "+(num/num2));
        cuadro.setPositiveButton(android.R.string.yes,null);
        //cuadro.setNegativeButton(android.R.string.no, null);
        cuadro.show();
    }
    public void salir(View view) {
        AlertDialog.Builder cuadro = new
                AlertDialog.Builder(this);
        cuadro.setMessage("¿Desea salir de la actividad");
        cuadro.setPositiveButton(android.R.string.yes,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface
                                                        dialog, int which) {
                                //Abandona la actividad
                                MainActivity.this.finish();
                            }
                        });
        cuadro.setNegativeButton(android.R.string.no, null);
        cuadro.show();
    }
}
