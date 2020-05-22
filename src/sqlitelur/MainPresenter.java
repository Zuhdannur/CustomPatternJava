/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitelur;

import listener.BaseActivity;

/**
 *
 * @author ZuhdanNur
 */
public class MainPresenter {
    BaseActivity activity;
    
    MainPresenter(BaseActivity activity){
        this.activity = activity;
    }
    
    public void start() {
        activity.base();
    }  
}
