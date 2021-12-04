package com.example.madfinumb.ui.NumberGuessing;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.Random;
import com.example.madfinumb.R;

//heavily recieved help from Grant on this, if you would like me to explain any of this at any point I 112% can
public class NumberFragment extends Fragment {

    public TextView help;
    public EditText guessTXT;
    public Button guessBTN;
    public Button resetBTN;
    public int attempts;
    public int number = 0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_numberguess,container,false);

        guessBTN = rootView.findViewById(R.id.enterBTN);
        resetBTN = rootView.findViewById(R.id.startBTN);
        help = rootView.findViewById(R.id.help);
        guessTXT = rootView.findViewById(R.id.numberText);


        guessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               guess();
            }
        });

        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setup();
            }
        });
        setup();
        return rootView;
    }

    private void setup(){
        attempts = 10;
        Random rng = new Random();
        number = rng.nextInt(100);
        Log.d("setup", String.valueOf(number));
//        number = (int) (Math.random()*100);
    }

    private void guess(){
        String g = String.valueOf(guessTXT.getText());
       int i = Integer.valueOf(g);;

       if(i==number){
           help.setText("Great Job! You guessed the number!");
           setup();
       }
       else if(i<number){
           attempts-=1;
           help.setText("Higher! You have "+attempts+" tries left.");
       }
       else if(i>number){
           attempts-=1;
           help.setText("Lower! You have "+attempts+" tries left.");
        }
       if(attempts==0){
           help.setText("Game Over! Try again.");
           setup();
       }
    }


}
