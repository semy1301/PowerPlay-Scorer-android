/* made by semy */

package com.example.scorepp;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    int autonomous = 0;
    int drive = 0;
    int end = 0;
    int totall=0;
    int totalpen=0;
    int at_cl_t=0;
    int at_gr_j=0;
    int at_lw_j=0;
    int at_md_j=0;
    int at_hg_j=0;
    int drv_cl_t=0;
    int drv_gr_j=0;
    int drv_lw_j=0;
    int drv_md_j=0;
    int drv_hg_j=0;
    int minpen=0;
    int majpen=0;
    int juntop=0;
    int juncap=0;
    int pen=0;

    boolean isIncremented=false;
    boolean isIncremented2=false;
    boolean isIncremented4=false;
    boolean isIncremented3=false;
    boolean isIncremented5=false;
    boolean isIncremented6=false;
    boolean parcat=false;
    /*boolean isIncremented7=false;
    boolean isIncremented8=false;*/
    boolean checked = false;
    boolean aa =false;
    boolean bb=false;
    boolean cc=false;
    boolean dd=false;

    boolean one=false;
    boolean two=false;

    boolean checked2 = false;
    boolean aa2 = false;
    boolean bb2 = false;
    boolean cc2 = false;
    boolean dd2 = false;

    boolean buton=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButtonn();
        addListenerOnButtonnd();
        addListenerOnButtonnpen();
        ActionButon();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.meniu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.tabpon:
                        Intent tabscor = new Intent(MainActivity.this, TabelScor.class);
                        startActivity(tabscor);
                        return true;
                    case R.id.tabpen:
                        Intent tabpenalizari = new Intent(MainActivity.this, TabelPenalties.class);
                        startActivity(tabpenalizari);
                        return true;
                    /*case R.id.gmn2t:
                        Uri urit = Uri.parse("https://firstinspiresst01.blob.core.windows.net/first-energize-ftc/game-manual-part-2-traditional.pdf"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, urit);
                        startActivity(intent);
                        return true;
                    case R.id.gmn2r:
                        Uri urir = Uri.parse("https://firstinspiresst01.blob.core.windows.net/first-energize-ftc/game-manual-part-2-remote.pdf"); // missing 'http://' will cause crashed
                        Intent intentt = new Intent(Intent.ACTION_VIEW, urir);
                        startActivity(intentt);
                        return true;*/
                    case R.id.gmn:
                        Uri urit = Uri.parse("https://ftc-docs.firstinspires.org/manuals/game_manuals/game_manuals.html"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, urit);
                        startActivity(intent);
                        return true;
                    case R.id.flwus:
                        Uri iss = Uri.parse("https://instagram.com/absotech");
                        Intent is = new Intent(Intent.ACTION_VIEW, iss);
                        //Intent is = new Intent(MainActivity.this, FollowUs.class);
                        startActivity(is);
                        return true;
                    case R.id.restart:
                        Intent i = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i);
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    public void ActionButon() {
        btnDisplay = (Button) findViewById(R.id.button25);
        TextView textVieww = (TextView) findViewById(R.id.textView44);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!buton) {
                    buton = true;
                    btnDisplay.setText("Traditional");
                    TextView textView = (TextView) findViewById(R.id.textView43);
                    radioGroup = (RadioGroup) findViewById(R.id.parkingtog2);
                    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar10);
                    TextView textVieww = (TextView) findViewById(R.id.textView33);
                    textVieww.setText("Robot 1 Parked");
                    //textView.setText("Traditional");
                    textView.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    toolbar.setVisibility(View.VISIBLE);
                } else if (buton) {
                    buton = false;
                    btnDisplay.setText("Remote");
                    TextView textView = (TextView) findViewById(R.id.textView43);
                    TextView textVieww = (TextView) findViewById(R.id.textView33);
                    radioGroup = (RadioGroup) findViewById(R.id.parkingtog2);
                    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar10);
                    //textView.setText("Remote");
                    textVieww.setText("Robot Parked");
                    textView.setVisibility(View.GONE);
                    radioGroup.setVisibility(View.GONE);
                    toolbar.setVisibility(View.GONE);
                }
            }
        });
    }

    public void actant(int scor){
        TextView tv1 = (TextView)findViewById(R.id.textView2);
        tv1.setText("Autonomous Points: " + scor);
    }
    public void drvant(int scor){
        TextView tv1 = (TextView)findViewById(R.id.textView4);
        tv1.setText("Drive Controlled Points: " + scor);
    }
    public void endant(int scor){
        TextView tv1 = (TextView)findViewById(R.id.textView7);
        tv1.setText("End Game Points: " + scor);
    }
    public void total(int scor){
        TextView tv2 = (TextView)findViewById(R.id.textView34);
        tv2.setText("Game Score: " + scor);
    }

    public void pen(int scor){
        TextView tv2 = (TextView)findViewById(R.id.textView37);
        tv2.setText("Penalties: " + scor);
    }
    public void totalpen(int scor){
        TextView tv3 = (TextView)findViewById(R.id.textView35);
        tv3.setText("Total Score: " + scor);
    }
    
    public void addListenerOnButtonn() {
        btnDisplay = (Button) findViewById(R.id.button2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at_cl_t++;
                actant(autonomous=autonomous+1);
                total(totall=totall+1);
                totalpen(totalpen=totalpen+1);
                ((TextView)findViewById(R.id.textView5)).setText(""+at_cl_t);}
        });
        btnDisplay = (Button) findViewById(R.id.button3);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(at_cl_t>0) {
                    at_cl_t--;
                    actant(autonomous = autonomous - 1);
                    total(totall=totall-1);
                    totalpen(totalpen=totalpen-1);
                }
                if(at_cl_t<0){
                    at_cl_t=0;
                }
                ((TextView)findViewById(R.id.textView5)).setText(""+at_cl_t);
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button4);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at_gr_j++;
                actant(autonomous=autonomous+2);
                total(totall=totall+2);
                totalpen(totalpen=totalpen+2);
                ((TextView)findViewById(R.id.textView25)).setText(""+at_gr_j);}
        });
        btnDisplay = (Button) findViewById(R.id.button5);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(at_gr_j>0) {
                    at_gr_j--;
                    actant(autonomous=autonomous-2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                }
                if(at_gr_j<0){
                    at_gr_j=0;
                }
                ((TextView)findViewById(R.id.textView25)).setText(""+at_gr_j);
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button6);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at_lw_j++;
                actant(autonomous = autonomous + 3);
                total(totall = totall + 3);
                totalpen(totalpen = totalpen + 3);
                ((TextView) findViewById(R.id.textView26)).setText("" + at_lw_j);
            }
        });
        btnDisplay = (Button) findViewById(R.id.button7);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(at_lw_j>0) {
                    at_lw_j--;
                    actant(autonomous=autonomous-3);
                    total(totall=totall-3);
                    totalpen(totalpen=totalpen-3);
                }
                if(at_lw_j<0){
                    at_lw_j=0;

                }
                ((TextView)findViewById(R.id.textView26)).setText(""+at_lw_j);
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button8);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at_md_j++;
                actant(autonomous=autonomous+4);
                total(totall=totall+4);
                totalpen(totalpen=totalpen+4);
                ((TextView)findViewById(R.id.textView27)).setText(""+at_md_j);}
        });
        btnDisplay = (Button) findViewById(R.id.button9);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(at_md_j>0) {
                    at_md_j--;
                    actant(autonomous=autonomous-4);
                    total(totall=totall-4);
                    totalpen(totalpen=totalpen-4);

                }
                if(at_md_j<0){
                    at_md_j=0;
                }
                ((TextView)findViewById(R.id.textView27)).setText(""+at_md_j);
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button10);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                at_hg_j++;
                actant(autonomous=autonomous+5);
                total(totall=totall+5);
                totalpen(totalpen=totalpen+5);
                ((TextView)findViewById(R.id.textView28)).setText(""+at_hg_j);
            }
        });
        btnDisplay = (Button) findViewById(R.id.button11);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(at_hg_j>0) {
                    at_hg_j--;
                    actant(autonomous=autonomous-5);
                    total(totall=totall-5);
                    totalpen(totalpen=totalpen-5);

                }
                if(at_hg_j<0){
                    at_hg_j=0;
                }
                ((TextView)findViewById(R.id.textView28)).setText(""+at_hg_j);
            }
        });
        //////////////////////////////////////////////////////////
    }

    public void addListenerOnButton() {
        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee);
        btnDisplay = (Button) findViewById(R.id.rumor);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented){
                    actant(autonomous=autonomous+2);
                    total(totall=totall+2);
                    totalpen(totalpen=totalpen+2);
                    isIncremented=!isIncremented;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    isIncremented = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee2);
        btnDisplay = (Button) findViewById(R.id.rumor2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented2){
                    actant(autonomous=autonomous+2);
                    total(totall=totall+2);
                    totalpen(totalpen=totalpen+2);
                    isIncremented2=!isIncremented2;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented2) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    isIncremented2 = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee3);
        btnDisplay = (Button) findViewById(R.id.rumor3);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented3){
                    actant(autonomous=autonomous+10);
                    total(totall=totall+10);
                    totalpen(totalpen=totalpen+10);
                    isIncremented3=!isIncremented3;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm3);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented3) {
                    actant(autonomous = autonomous - 10);
                    total(totall=totall-10);
                    totalpen(totalpen=totalpen-10);
                    isIncremented3 = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee4);
        btnDisplay = (Button) findViewById(R.id.rumor4);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented4){
                    actant(autonomous=autonomous+20);
                    total(totall=totall+20);
                    totalpen(totalpen=totalpen+20);
                    isIncremented4=!isIncremented4;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm4);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented4) {
                    actant(autonomous=autonomous-20);
                    total(totall=totall-20);
                    totalpen(totalpen=totalpen-20);
                    isIncremented4 = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.parkingtog);
        btnDisplay = (Button) findViewById(R.id.parksig);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked==false){
                    if (bb == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb = false;
                    }
                    if (cc == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc = false;
                    }
                    if (dd == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd = false;
                    }
                if(!aa ){
                    actant(autonomous=autonomous+10);
                    total(totall=totall+10);
                    totalpen(totalpen=totalpen+10);
                    aa = true;
                }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkslev);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked==false){
                    if (aa) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa = false;
                    }
                    if (cc == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc = false;
                    }
                    if (dd == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd = false;
                    }
                if (!bb ) {
                    actant(autonomous = autonomous + 20);
                    total(totall=totall+20);
                    totalpen(totalpen=totalpen+20);
                    bb = true;
                }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkterm);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked==false){
                    if (aa) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa = false;
                    }
                    if (bb == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb = false;
                    }
                    if (dd == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd = false;
                    }
                if (!cc) {
                    actant(autonomous = autonomous + 2);
                    total(totall=totall+2);
                    totalpen(totalpen=totalpen+2);
                    cc = true;
                }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parksubst);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked==false){
                    if (aa) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa = false;
                    }
                    if (bb == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb = false;
                    }
                    if (cc == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc = false;
                    }
                if (!dd) {
                    actant(autonomous = autonomous + 2);
                    total(totall=totall+2);
                    totalpen(totalpen=totalpen+2);
                    dd = true;
                }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkno);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                checked = false;
                if (aa) {
                    actant(autonomous = autonomous - 10);
                    total(totall=totall-10);
                    totalpen(totalpen=totalpen-10);
                    aa = false;
                }
                if (bb == true) {
                    actant(autonomous = autonomous - 20);
                    total(totall=totall-20);
                    totalpen(totalpen=totalpen-20);
                    bb = false;
                }
                if (cc == true) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    cc = false;
                }
                if (dd == true) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    dd = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.parkingtog2);
        btnDisplay = (Button) findViewById(R.id.parksig2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked2==false){
                    if (bb2 == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb2 = false;
                    }
                    if (cc2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc2 = false;
                    }
                    if (dd2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd2 = false;
                    }
                    if(!aa2 ){
                        actant(autonomous=autonomous+10);
                        total(totall=totall+10);
                        totalpen(totalpen=totalpen+10);
                        aa2 = true;
                    }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkslev2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked2==false){
                    if (aa2) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa2 = false;
                    }
                    if (cc2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc2 = false;
                    }
                    if (dd2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd2 = false;
                    }
                    if (!bb2 ) {
                        actant(autonomous = autonomous + 20);
                        total(totall=totall+20);
                        totalpen(totalpen=totalpen+20);
                        bb2 = true;
                    }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkterm2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked2==false){
                    if (aa2) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa2 = false;
                    }
                    if (bb2 == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb2 = false;
                    }
                    if (dd2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        dd2 = false;
                    }
                    if (!cc2) {
                        actant(autonomous = autonomous + 2);
                        total(totall=totall+2);
                        totalpen(totalpen=totalpen+2);
                        cc2 = true;
                    }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parksubst2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(checked2==false){
                    if (aa2) {
                        actant(autonomous = autonomous - 10);
                        total(totall=totall-10);
                        totalpen(totalpen=totalpen-10);
                        aa2 = false;
                    }
                    if (bb2 == true) {
                        actant(autonomous = autonomous - 20);
                        total(totall=totall-20);
                        totalpen(totalpen=totalpen-20);
                        bb2 = false;
                    }
                    if (cc2 == true) {
                        actant(autonomous = autonomous - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        cc2 = false;
                    }
                    if (!dd2) {
                        actant(autonomous = autonomous + 2);
                        total(totall=totall+2);
                        totalpen(totalpen=totalpen+2);
                        dd2 = true;
                    }}
            }
        });
        btnDisplay = (Button) findViewById(R.id.parkno2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                checked2 = false;
                if (aa2) {
                    actant(autonomous = autonomous - 10);
                    total(totall=totall-10);
                    totalpen(totalpen=totalpen-10);
                    aa2 = false;
                }
                if (bb2 == true) {
                    actant(autonomous = autonomous - 20);
                    total(totall=totall-20);
                    totalpen(totalpen=totalpen-20);
                    bb2 = false;
                }
                if (cc2 == true) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    cc2 = false;
                }
                if (dd2 == true) {
                    actant(autonomous = autonomous - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    dd2 = false;
                }
            }
        });



        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee5);
        btnDisplay = (Button) findViewById(R.id.rumor5);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented5){
                    endant(end=end+20);
                    total(totall=totall+20);
                    totalpen(totalpen=totalpen+20);
                    isIncremented5=!isIncremented5;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm5);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented5) {
                    endant(end = end - 20);
                    total(totall=totall-20);
                    totalpen(totalpen=totalpen-20);
                    isIncremented5 = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee6);
        btnDisplay = (Button) findViewById(R.id.rumor6);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!parcat){
                    if(!one){one=true;
                    endant(end=end+2);
                    total(totall=totall+2);
                    totalpen(totalpen=totalpen+2);}
                    if(two) {
                        endant(end = end - 4);
                        total(totall = totall - 4);
                        totalpen(totalpen = totalpen - 4);
                        two=false;
                    }
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.rumor9);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!parcat){
                    if(!two){two=true;
                    endant(end=end+4);
                    total(totall=totall+4);
                    totalpen(totalpen=totalpen+4);}
                    if(one){
                        endant(end = end - 2);
                        total(totall=totall-2);
                        totalpen(totalpen=totalpen-2);
                        one=false;
                    }
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm6);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(one){
                    endant(end = end - 2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                    one=false;
                }
                if(two) {
                    endant(end = end - 4);
                    total(totall = totall - 4);
                    totalpen(totalpen = totalpen - 4);
                    two=false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        /*radioGroup = (RadioGroup) findViewById(R.id.togglee7);
        btnDisplay = (Button) findViewById(R.id.rumor7);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented7){
                    endant(end=end+3);
                    total(totall=totall+3);
                    totalpen(totalpen=totalpen+3);
                    isIncremented7=!isIncremented7;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm7);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented7) {
                    endant(end = end - 3);
                    total(totall=totall-3);
                    totalpen(totalpen=totalpen-3);
                    isIncremented7 = false;
                }
            }
        });

        //////////////////////////////////////////////////////////

        radioGroup = (RadioGroup) findViewById(R.id.togglee8);
        btnDisplay = (Button) findViewById(R.id.rumor8);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(!isIncremented8){
                    endant(end=end+10);
                    total(totall=totall+10);
                    totalpen(totalpen=totalpen+10);
                    isIncremented8=!isIncremented8;
                }
            }
        });
        btnDisplay = (Button) findViewById(R.id.calm8);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if(isIncremented8) {
                    endant(end = end - 10);
                    total(totall=totall-10);
                    totalpen(totalpen=totalpen-10);
                    isIncremented8 = false;
                }
            }
        });*/

    }
    
    public void addListenerOnButtonnd() {
        btnDisplay = (Button) findViewById(R.id.button12);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drv_cl_t++;
                drvant(drive=drive+1);
                total(totall=totall+1);
                totalpen(totalpen=totalpen+1);
                ((TextView)findViewById(R.id.textView29)).setText(String.valueOf(drv_cl_t));}
        });
        btnDisplay = (Button) findViewById(R.id.button13);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drv_cl_t>0) {
                    drv_cl_t--;
                    drvant(drive = drive - 1);
                    total(totall=totall-1);
                    totalpen(totalpen=totalpen-1);
                }
                if(drv_cl_t<0){
                    drv_cl_t=0;
                }
                ((TextView)findViewById(R.id.textView29)).setText(String.valueOf(drv_cl_t));
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drv_gr_j++;
                drvant(drive=drive+2);
                total(totall=totall+2);
                totalpen(totalpen=totalpen+2);
                ((TextView)findViewById(R.id.textView6)).setText(String.valueOf(drv_gr_j));}
        });
        btnDisplay = (Button) findViewById(R.id.button14);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drv_gr_j>0) {
                    drv_gr_j--;
                    drvant(drive=drive-2);
                    total(totall=totall-2);
                    totalpen(totalpen=totalpen-2);
                }
                if(drv_gr_j<0){
                    drv_gr_j=0;
                }
                ((TextView)findViewById(R.id.textView6)).setText(String.valueOf(drv_gr_j));
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button15);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drv_lw_j++;
                drvant(drive=drive+3);
                total(totall=totall+3);
                totalpen(totalpen=totalpen+3);
                ((TextView)findViewById(R.id.textView30)).setText(String.valueOf(drv_lw_j));}
        });
        btnDisplay = (Button) findViewById(R.id.button16);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drv_lw_j>0) {
                    drv_lw_j--;
                    drvant(drive=drive-3);
                    total(totall=totall-3);
                    totalpen(totalpen=totalpen-3);
                }
                if(drv_lw_j<0){
                    drv_lw_j=0;
                }
                ((TextView)findViewById(R.id.textView30)).setText(String.valueOf(drv_lw_j));
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button17);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drv_md_j++;
                drvant(drive=drive+4);
                total(totall=totall+4);
                totalpen(totalpen=totalpen+4);
                ((TextView)findViewById(R.id.textView31)).setText(String.valueOf(drv_md_j));}
        });
        btnDisplay = (Button) findViewById(R.id.button18);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drv_md_j>0) {
                    drv_md_j--;
                    drvant(drive=drive-4);
                    total(totall=totall-4);
                    totalpen(totalpen=totalpen-4);
                }
                if(drv_md_j<0){
                    drv_md_j=0;
                }
                ((TextView)findViewById(R.id.textView31)).setText(String.valueOf(drv_md_j));
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button19);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drv_hg_j++;
                drvant(drive=drive+5);
                total(totall=totall+5);
                totalpen(totalpen=totalpen+5);
                ((TextView)findViewById(R.id.textView32)).setText(String.valueOf(drv_hg_j));}
        });
        btnDisplay = (Button) findViewById(R.id.button20);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drv_hg_j>0 && drv_hg_j > at_hg_j) {
                    drv_hg_j--;
                    drvant(drive=drive-5);
                    total(totall=totall-5);
                    totalpen(totalpen=totalpen-5);
                }
                if(drv_hg_j<0 && drv_hg_j < at_hg_j){
                    drv_hg_j=0;
                }
                ((TextView)findViewById(R.id.textView32)).setText(""+drv_hg_j);
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button26);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juntop++;
                endant(end=end+3);
                total(totall=totall+3);
                totalpen(totalpen=totalpen+3);
                ((TextView)findViewById(R.id.textView41)).setText(String.valueOf(juntop));}
        });
        btnDisplay = (Button) findViewById(R.id.button27);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(juntop>0) {
                    juntop--;
                    endant(end=end-3);
                    total(totall=totall-3);
                    totalpen(totalpen=totalpen-3);
                }
                if(juntop<0){
                    juntop=0;
                }
                ((TextView)findViewById(R.id.textView41)).setText(String.valueOf(juntop));
            }
        });
        //////////////////////////////////////////////////////////
        btnDisplay = (Button) findViewById(R.id.button28);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juncap++;
                endant(end=end+10);
                total(totall=totall+10);
                totalpen(totalpen=totalpen+10);
                ((TextView)findViewById(R.id.textView42)).setText(String.valueOf(juncap));}
        });
        btnDisplay = (Button) findViewById(R.id.button29);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(juncap>0) {
                    juncap--;
                    endant(end=end-10);
                    total(totall=totall-10);
                    totalpen(totalpen=totalpen-10);
                }
                if(juncap<0){
                    juncap=0;
                }
                ((TextView)findViewById(R.id.textView42)).setText(String.valueOf(juncap));
            }
        });
    }
    
    public void addListenerOnButtonnpen() {
        btnDisplay = (Button) findViewById(R.id.button21);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minpen++;
                totalpen(totalpen = totalpen - 10);
                pen(pen = pen - 10);
                ((TextView) findViewById(R.id.textView39)).setText(String.valueOf(minpen));
            }
        });
        btnDisplay = (Button) findViewById(R.id.button22);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minpen > 0) {
                    minpen--;
                    totalpen(totalpen = totalpen + 10);
                    pen(pen = pen + 10);
                }
                if (minpen < 0) {
                    minpen = 0;
                }
                ((TextView) findViewById(R.id.textView39)).setText(String.valueOf(minpen));
            }
        });
        //////////////////////////////////////////////////////////

        btnDisplay = (Button) findViewById(R.id.button23);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                majpen++;
                totalpen(totalpen = totalpen - 30);
                pen(pen = pen - 30);
                ((TextView) findViewById(R.id.textView40)).setText(String.valueOf(majpen));
            }
        });
        btnDisplay = (Button) findViewById(R.id.button24);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (majpen > 0) {
                    majpen--;
                    totalpen(totalpen = totalpen + 30);
                    pen(pen = pen + 30);
                }
                if (majpen < 0) {
                    majpen = 0;
                }
                ((TextView) findViewById(R.id.textView40)).setText(String.valueOf(majpen));
            }
        });
    }
}


