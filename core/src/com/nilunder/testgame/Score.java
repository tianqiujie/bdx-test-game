package com.nilunder.testgame;

import com.nilunder.bdx.*;

public class Score extends Text{

	private Sacky sacky;
	private int score;

	public void init(){
		Scene mainScene = Bdx.scenes.get("Main");
		sacky = (Sacky)mainScene.objects.get("Sacky");
	}

	public void main(){
		if (sacky.isNormal())
			score = 0;

		if (sacky.hit("Bottle")){
			++score;
			set(String.format("%03d", score));
		}
	}
}
