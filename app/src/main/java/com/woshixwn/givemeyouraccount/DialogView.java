package com.woshixwn.givemeyouraccount;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * Created by woshi on 2016-08-23.
 */
public class DialogView extends LinearLayout {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView text;
    StringBuffer stringBuffer;
    OnClickListener onClickListener;
    public DialogView(Context context){
        super(context);
        final View root = View.inflate(getContext(), R.layout.dialog_mydialog,null);
        onClickListener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        System.exit(0);
                        break;
                    case R.id.button_1:
                        addStr(1);
                        break;
                    case R.id.button_2:
                        addStr(2);
                        break;
                    case R.id.button_3:
                        addStr(3);
                        break;
                    case R.id.button_4:
                        addStr(4);
                        break;
                    case R.id.button_5:
                        addStr(5);
                        break;
                    case R.id.button_6:
                        addStr(6);
                        break;
                    case R.id.button_7:
                        addStr(7);
                        break;
                    case R.id.button_8:
                        addStr(8);
                        break;
                    case R.id.button_9:
                        addStr(9);
                        break;
                    default:
                        break;
                }
            }
        };

        stringBuffer = new StringBuffer();
        button = (Button) root.findViewById(R.id.button);
        button1 = (Button) root.findViewById(R.id.button_1);
        button2 = (Button) root.findViewById(R.id.button_2);
        button3 = (Button) root.findViewById(R.id.button_3);
        button4 = (Button) root.findViewById(R.id.button_4);
        button5 = (Button) root.findViewById(R.id.button_5);
        button6 = (Button) root.findViewById(R.id.button_6);
        button7 = (Button) root.findViewById(R.id.button_7);
        button8 = (Button) root.findViewById(R.id.button_8);
        button9 = (Button) root.findViewById(R.id.button_9);
        text = (TextView) root.findViewById(R.id.text);
        button.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);

        addView(root);
    }

    private void addStr(int i) {
        if(stringBuffer.length()<=4){
            stringBuffer.append(i+"");
            text.setText(stringBuffer);
        }
    }
}
