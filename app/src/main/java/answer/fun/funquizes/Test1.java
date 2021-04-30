package answer.fun.funquizes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Test1 extends AppCompatActivity {
    Dialog dialog;
    Dialog dialogEnd;
    TextView qwest;
    TextView anwer;
    TextView w1;
    TextView w2;
    TextView w3;
    ArrayList <Test> list = new ArrayList<>();
    ArrayList<TextView> arrayListText = new ArrayList<>();
    public int count = 0;
    Integer number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        number=0;

        Test test1=new Test("Как звали лошадь Дон Кихота?", "Росинант",  "Юлий", "Шептало",  "Фердинант","Конь");
        Test test2=new Test("Знаменитый писатель-фантаст Айзек Азимов написал:", "Слова в науке",  "Биография Галилео Галилея",  "Мы",  "Четверо друзей", "Братья");
        Test test3 = new Test("Назовите имя замечательного русского поэта Майкова", "Аполлон", "Артур",  "Марк", "Владислав", "Кирилл");
        Test test4 = new Test("Где родился главный герой романа А.С. Пушкина «Евгений Онегин»?", "Петербург", "Москва", "Владивосток",  "Кавказ", "Саратов");
        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);


        qwest=findViewById(R.id.textQuestion1);
        anwer=findViewById(R.id.textView22);
        w1=findViewById(R.id.textView23);
        w2=findViewById(R.id.textView24);
        w3=findViewById(R.id.textView25);
        arrayListText.add(anwer);
        arrayListText.add(w1);
        arrayListText.add(w2);
        arrayListText.add(w3);
        qwest.setText(test1.qwest);
        anwer.setText(test1.rAnser);
        w1.setText(test1.wAnser1);
        w2.setText(test1.wAnser2);
        w3.setText(test1.wAnser3);






    }
    final int[] progress ={
            R.id.point1,
            R.id.point2,
            R.id.point3,
            R.id.point4,
            R.id.point5,
            R.id.point6,
            R.id.point7,
            R.id.point8,
            R.id.point9,
            R.id.point10,
            R.id.point11,
            R.id.point12,
            R.id.point13,
            R.id.point14,
            R.id.point15,


    };




    void show(){
        qwest.setText(list.get(number).qwest);
        int num=(int)(Math.random()*4);

        for (int i=0;i<4;i++){

            if(i==num){
                arrayListText.get(i).setText(list.get(number).rAnser);}
            else {
                switch (i){
                    case 0:
                        arrayListText.get(i).setText(list.get(number).wAnser1);
                        break;
                    case 1:
                        arrayListText.get(i).setText(list.get(number).wAnser2);
                        break;
                    case 2:
                        arrayListText.get(i).setText(list.get(number).wAnser3);
                        break;
                    case 3:
                        arrayListText.get(i).setText(list.get(number).wAnser1);
                        break;
                }
            }
                      }
                  }







    public void nexp(View view) {
        int id=view.getId();
        switch (id){
            case R.id.textView22: if(anwer.getText().toString().equals(list.get(number).rAnser)){

                    count++;

                for (int y=0; y<count; y++){
                    TextView tv = findViewById(progress[y]);
                    tv.setBackgroundResource(R.drawable.style_points_green);
                }





            } else{
                count=count+0;



            }
                break;
            case R.id.textView23: if(w1.getText().toString().equals(list.get(number).rAnser)){

                    count++;


                for (int y=0; y<count; y++){
                    TextView tv = findViewById(progress[y]);
                    tv.setBackgroundResource(R.drawable.style_points_green);
                }



            }else{
                count=count+0;



            }
                break;
            case R.id.textView24:if(w2.getText().toString().equals(list.get(number).rAnser)){

                    count++;

                for (int y=0; y<count; y++){
                    TextView tv = findViewById(progress[y]);
                    tv.setBackgroundResource(R.drawable.style_points_green);
                }



            }else{
                count=count+0;



            }
                break;
            case R.id.textView25:if(w3.getText().toString().equals(list.get(number).rAnser))
            {
                    count++;


                for (int y=0; y<count; y++){
                    TextView tv = findViewById(progress[y]);
                    tv.setBackgroundResource(R.drawable.style_points_green);
                }




            }else{
                count=count+0;



            }
                break;


    }
        number++;
        show();

}}






