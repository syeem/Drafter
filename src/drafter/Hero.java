/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drafter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SyeemMorshed
 */
public class Hero {

    enum Trait {

        Nuker, AoeNuker, SplitPusher, SoloKiller, LaneDominator, Harraser, Pusher,
        AntiPusher, TeamFighter, Slippery, GankSetup, Savior, Healer, Initiator, Tank;
    }

    String name;
    List<Trait> traits;

    public Hero() {
    }

    public void Name(String name) {
        this.name = name;
    }

    public void Traits(List<Trait> traits) {
        this.traits = traits;
    }

    public static List<Hero> CreateHeroes() {
        List<Hero> heroes = new ArrayList<>();

        Hero h = new Hero();
        h.name = "Abaddon";
        List<Trait> t = new ArrayList<>();
        t.add(Trait.Savior);
        t.add(Trait.Healer);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);
        
        h = new Hero();
        h.name = "Alchemist";
        t = new ArrayList<>();
        t.add(Trait.AntiPusher);
        h.traits = t;
        heroes.add(h);
        
        h = new Hero();
        h.name = "AncientApparition";
        t = new ArrayList<>();
        t.add(Trait.AntiPusher);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);
        
        h = new Hero();
        h.name = "Axe";
        t = new ArrayList<>();
        t.add(Trait.Initiator);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);
        
        
        return heroes;
    }
}
