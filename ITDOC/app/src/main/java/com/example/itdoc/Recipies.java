package com.example.itdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Recipies extends AppCompatActivity {

  //  private FragmentManager mFragmentManager;
  //  private FragmentTransaction mFragmentTransaction;
private  EditText one;
    private  EditText two;
    private  EditText three;
    private  EditText four;
    private  EditText five;
    private  EditText six;
    private  EditText seven;

    private  EditText eight;
    private  EditText nine;
    private  EditText ten;
    private  EditText eleven;
    private  EditText twelve;
    private  EditText thirteen;
    private  EditText fourteen;

    private  EditText fifteen;
    private  EditText sixteen;
    private  EditText seventeen;
    private  EditText eighteen;
    private  EditText nineteen;
    public int tch =0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipies);

   //     mFragmentManager = getFragmentManager();
    }

    public void onClick(View v) {

        if(v.getId() == R.id.button_season_ills){
            if(tch == 0){
                one = (EditText) findViewById(R.id.first);
                one.setVisibility(View.INVISIBLE);

            }

        }
       /* mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button_season_ills:
                MyFragmentForRecipies bluefragment = new MyFragmentForRecipies();
                mFragmentTransaction.add(R.id.container_for_recepies, bluefragment);
                break;
            case R.id.button_season_ills1:
                MyFragmentForkzkkz redfragment = new MyFragmentForkzkkz();
                mFragmentTransaction.add(R.id.container_for_recepies, redfragment);
                break;
        }
        mFragmentTransaction.commit();
*/


    }
}
