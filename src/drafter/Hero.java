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
        AntiPusher, TeamFighter, Slippery, GankSetup, Savior, Healer, Initiator, Tank, Lockdown;
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

    public String GetString() {
        String str = "";
        for (Trait t : traits) {
            str += t.toString();
            str += " ";
        }
        return str;
    }

    public static List<Hero> CreateHeroes() {
        List<Hero> heroes = new ArrayList<>();

        //A
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
        h.name = "AntiMage";
        t = new ArrayList<>();
        t.add(Trait.SplitPusher);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Axe";
        t = new ArrayList<>();
        t.add(Trait.Initiator);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        //B
        h = new Hero();
        h.name = "Bane";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Batrider";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.Initiator);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BeastMaster";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BloodSeeker";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BountyHunter";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BrewMaster";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BristleBack";
        t = new ArrayList<>();
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "BroodMother";
        t = new ArrayList<>();
        t.add(Trait.SplitPusher);
        t.add(Trait.SoloKiller);
        t.add(Trait.Slippery);
        t.add(Trait.Nuker);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Centaur";
        t = new ArrayList<>();
        t.add(Trait.Tank);
        t.add(Trait.Nuker);
        t.add(Trait.Initiator);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "ChaosKnight";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Chen";
        t = new ArrayList<>();
        t.add(Trait.Pusher);
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Clinkz";
        t = new ArrayList<>();
        t.add(Trait.Harraser);
        t.add(Trait.LaneDominator);
        t.add(Trait.Slippery);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Clockwerk";
        t = new ArrayList<>();
        t.add(Trait.Tank);
        t.add(Trait.GankSetup);
        t.add(Trait.Initiator);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "CrystalMaiden";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        //D
        h = new Hero();
        h.name = "DarkSeer";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Initiator);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Dazzle";
        t = new ArrayList<>();
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "DeathProphet";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Disruptor";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Doom";
        t = new ArrayList<>();
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "DragonKnight";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Pusher);
        t.add(Trait.Initiator);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Drow";
        t = new ArrayList<>();
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        //E
        h = new Hero();
        h.name = "EarthSpirit";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.AoeNuker);
        t.add(Trait.Initiator);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "EarthShaker";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.Initiator);
        t.add(Trait.Lockdown);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "ElderTitan";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "EmberSpirit";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.GankSetup);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Enchantress";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Enigma";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Pusher);
        t.add(Trait.Lockdown);
        h.traits = t;
        heroes.add(h);

        //F
        h = new Hero();
        h.name = "FacelessVoid";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Lockdown);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        //G
        h = new Hero();
        h.name = "Gyrocopter";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Nuker);
        h.traits = t;
        heroes.add(h);

        //H
        h = new Hero();
        h.name = "Huskar";
        t = new ArrayList<>();
        t.add(Trait.LaneDominator);
        t.add(Trait.Harraser);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        //I
        h = new Hero();
        h.name = "Invoker";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.SoloKiller);
        t.add(Trait.TeamFighter);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "IO";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        h.traits = t;
        heroes.add(h);

        //J
        h = new Hero();
        h.name = "Jakiro";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Pusher);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Juggernaut";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.Healer);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        //K
        h = new Hero();
        h.name = "KeeperOfTheLight";
        t = new ArrayList<>();
        t.add(Trait.AntiPusher);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Kunkka";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        //L
        h = new Hero();
        h.name = "LegionCommander";
        t = new ArrayList<>();
        t.add(Trait.Lockdown);
        t.add(Trait.Healer);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Leshrac";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.GankSetup);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Lich";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Lifestealer";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Lina";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.GankSetup);
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Lion";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        t.add(Trait.Lockdown);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "LoneDruid";
        t = new ArrayList<>();
        t.add(Trait.SplitPusher);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Luna";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Lycan";
        t = new ArrayList<>();
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        //M
        h = new Hero();
        h.name = "Magnus";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        t.add(Trait.Lockdown);
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Medusa";
        t = new ArrayList<>();
        t.add(Trait.Tank);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Meepo";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.Pusher);
        t.add(Trait.Lockdown);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Mirana";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Morphling";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.SplitPusher);
        t.add(Trait.Tank);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        //N
        h = new Hero();
        h.name = "NagaSiren";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.SplitPusher);
        t.add(Trait.GankSetup);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "NaturesProphet";
        t = new ArrayList<>();
        t.add(Trait.Pusher);
        t.add(Trait.SplitPusher);
        t.add(Trait.GankSetup);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Necro";
        t = new ArrayList<>();
        t.add(Trait.Pusher);
        t.add(Trait.Healer);
        t.add(Trait.GankSetup);
        t.add(Trait.Harraser);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "NightStalker";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Nyx";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.SoloKiller);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        //O
        h = new Hero();
        h.name = "Ogre";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Omni";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Oracle";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "OD";
        t = new ArrayList<>();
        t.add(Trait.LaneDominator);
        t.add(Trait.TeamFighter);
        t.add(Trait.Harraser);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        //P
        h = new Hero();
        h.name = "PhantomAssasin";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "PhantomLancer";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Slippery);
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Phoenix";
        t = new ArrayList<>();
        t.add(Trait.Harraser);
        t.add(Trait.Slippery);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Puck";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Slippery);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Pudge";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Tank);
        t.add(Trait.Lockdown);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Pugna";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Harraser);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        //Q
        h = new Hero();
        h.name = "QOP";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Slippery);
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        //R
        h = new Hero();
        h.name = "Razor";
        t = new ArrayList<>();
        t.add(Trait.Tank);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Riki";
        t = new ArrayList<>();
        t.add(Trait.SoloKiller);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Rubick";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Nuker);
        h.traits = t;
        heroes.add(h);

        //S
        h = new Hero();
        h.name = "SandKing";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Slippery);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "ShadowDemon";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "ShadowFiend";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.LaneDominator);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "ShadowShaman";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Pusher);
        t.add(Trait.Lockdown);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Silencer";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.LaneDominator);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Sky";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.LaneDominator);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Slardar";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Slark";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.GankSetup);
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Sniper";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Spectre";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.TeamFighter);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "SpiritBreaker";
        t = new ArrayList<>();
        t.add(Trait.Initiator);
        t.add(Trait.GankSetup);
        t.add(Trait.Nuker);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Storm";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Sven";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        //T
        h = new Hero();
        h.name = "Techies";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.SplitPusher);
        t.add(Trait.AntiPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "TemplarAssasin";
        t = new ArrayList<>();
        t.add(Trait.LaneDominator);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "TerrorBlade";
        t = new ArrayList<>();
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "TideHunter";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Timber";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.AntiPusher);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Tinker";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.AntiPusher);
        t.add(Trait.Slippery);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Tiny";
        t = new ArrayList<>();
        t.add(Trait.AoeNuker);
        t.add(Trait.Pusher);
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Treant";
        t = new ArrayList<>();
        t.add(Trait.Healer);
        t.add(Trait.TeamFighter);
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Troll";
        t = new ArrayList<>();
        t.add(Trait.LaneDominator);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Tusk";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Nuker);
        t.add(Trait.Initiator);
        h.traits = t;
        heroes.add(h);

        //U
        h = new Hero();
        h.name = "Undying";
        t = new ArrayList<>();
        t.add(Trait.TeamFighter);
        t.add(Trait.Healer);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Ursa";
        t = new ArrayList<>();
        t.add(Trait.SoloKiller);
        h.traits = t;
        heroes.add(h);

        //V
        h = new Hero();
        h.name = "VS";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.Savior);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Veno";
        t = new ArrayList<>();
        t.add(Trait.GankSetup);
        t.add(Trait.TeamFighter);
        t.add(Trait.AntiPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Viper";
        t = new ArrayList<>();
        t.add(Trait.LaneDominator);
        t.add(Trait.Harraser);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Visage";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        //W
        h = new Hero();
        h.name = "Warlock";
        t = new ArrayList<>();
        t.add(Trait.Healer);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Weaver";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.SplitPusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Windrunner";
        t = new ArrayList<>();
        t.add(Trait.Slippery);
        t.add(Trait.Nuker);
        t.add(Trait.Harraser);
        t.add(Trait.GankSetup);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "Winter";
        t = new ArrayList<>();
        t.add(Trait.Healer);
        t.add(Trait.Savior);
        t.add(Trait.Lockdown);
        t.add(Trait.GankSetup);
        t.add(Trait.Pusher);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "WD";
        t = new ArrayList<>();
        t.add(Trait.Healer);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        h = new Hero();
        h.name = "WraithKing";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.Tank);
        h.traits = t;
        heroes.add(h);

        //Z
        h = new Hero();
        h.name = "Zeus";
        t = new ArrayList<>();
        t.add(Trait.Nuker);
        t.add(Trait.TeamFighter);
        h.traits = t;
        heroes.add(h);

        return heroes;

    }
}
