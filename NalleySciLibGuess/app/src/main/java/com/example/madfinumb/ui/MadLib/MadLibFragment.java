package com.example.madfinumb.ui.MadLib;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.madfinumb.R;

public class MadLibFragment extends Fragment {
    TextView output;
    EditText first;
    EditText second;
    EditText third;
    EditText fourth;
    EditText fifth;
    EditText sixth;
    EditText seventh;
    EditText eigth;
    Button generator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,
                container,
                savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_madlib, container, false);

        first = rootView.findViewById(R.id.firstTXT);
        second = rootView.findViewById(R.id.secondTXT);
        third = rootView.findViewById(R.id.thirdTXT);
        fourth = rootView.findViewById(R.id.fourthTXT);
        fifth = rootView.findViewById(R.id.fifthTXT);
        sixth = rootView.findViewById(R.id.sixthTXT);
        seventh = rootView.findViewById(R.id.seventhTXT);
        eigth = rootView.findViewById(R.id.eigthTXT);
        output = rootView.findViewById(R.id.output);
        generator = rootView.findViewById(R.id.generatorBTN);

        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });
        return rootView;
    }


    private void generate() {
        String one = String.valueOf(first.getText());
        String two = String.valueOf(second.getText());
        String three = String.valueOf(third.getText());
        String four = String.valueOf(fourth.getText());
        String five = String.valueOf(fifth.getText());
        String six = String.valueOf(sixth.getText());
        String seven = String.valueOf(seventh.getText());
        String eight = String.valueOf(eigth.getText());
        int min = 1;
        int max = 3;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(random_int==1){
            output.setText(String.format("There was once a boy called %s. He was very poor. He lived with his mother named %s. One day he found %s gold coins and %s silver coins. Then he went and bought some paper and crayons, made %s kites and sold them. Then he took the money and bought a %s, a %s, a %s dress for his mom and lots of gifts for his house and became very rich.",one,two,three,four,five,six,seven,eight));
        }
        else if(random_int==2){
            output.setText(String.format("One day %s went to the zoo. It was %s. There were %s and %s and %s, but she never expected to find that one of the animals, the %s, would go crazy! she screamed and ran awa She escaped! So the big family celebrated with %s and %s.",one,two,three,four,five,six,seven,eight));
        }
        else{
            output.setText(String.format("Once their was an %s house in %s. Nobody would ever go to that house because it was so %s. One night when a new kid moved into that house, he thought that it was the %s house of all that he had been to. He made creations and all sorts of things to make that house decorated! It was %s o'clock at night. The little boy started to hear a %s outside his bedroom. He just tried to fall asleep. The next morning he went outside and saw a %s pumpkin by his window. The pumkin was rotten. The little boy brought the pumpkin in his house. He put it in his %s that was dark. The next morning the little boy went to check on his pumpkin and it was really rotten! The boy tried to take it outside but it would make a slimy hole in the pumpkin. That little boy thought for a second and understood the meaning of why pumpkins are grown in sunlight instead of the dark.",one,two,three,four,five,six,seven,eight));
        }

    }
}
