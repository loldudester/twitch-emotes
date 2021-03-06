package com.TwitchEmotes;

import com.google.common.collect.ImmutableMap;
import java.awt.image.BufferedImage;
import java.util.Map;
import net.runelite.client.util.ImageUtil;


enum Emote
{
    FOURHEAD("4head"),
    ANELE("anele"),
    ARGIEB8("argieb8"),
    ARIGATONAS("arigatonas"),
    ARSONNOSEXY("arsonnosexy"),
    ASEXUALPRIDE("asexualpride"),
    ASIANGLOW("asianglow"),
    BABYRAGE("babyrage"),
    BATCHEST("batchest"),
    BCWARRIOR("bcwarrior"),
    BEGWAN("begwan"),
    BIBLETHUMP("biblethump"),
    BIGBROTHER("bigbrother"),
    BIGPHISH("bigphish"),
    BISEXUALPRIDE("bisexualpride"),
    BLARGNAUT("blargnaut"),
    BLEEDPURPLE("bleedpurple"),
    BLESSRNG("blessrng"),
    BLOODTRAIL("bloodtrail"),
    BRAINSLUG("brainslug"),
    BROKEBACK("brokeback"),
    BUDDHABAR("buddhabar"),
    CARLSMILE("carlsmile"),
    CHEFFRANK("cheffrank"),
    CMONBRUH("cmonbruh"),
    COOLCAT("coolcat"),
    COOLSTORYBOB("coolstorybob"),
    COPYTHIS("copythis"),
    CORGIDERP("corgiderp"),
    CRREAMAWK("crreamawk"),
    CURSELIT("curselit"),
    DAESUPPY("daesuppy"),
    DANSGAME("dansgame"),
    DARKMODE("darkmode"),
    DATSHEFFY("datsheffy"),
    DBSTYLE("dbstyle"),
    DENDIFACE("dendiface"),
    DOGFACE("dogface"),
    DORITOSCHIP("doritoschip"),
    DRINKPURPLE("drinkpurple"),
    DUDUDU("dududu"),
    DXCAT("dxcat"),
    EARTHDAY("earthday"),
    ELEGIGGLE("elegiggle"),
    ENTROPYWINS("entropywins"),
    FAILFISH("failfish"),
    FBBLOCK("fbblock"),
    FBCATCH("fbcatch"),
    FBCHALLENGE("fbchallenge"),
    FBPASS("fbpass"),
    FBPENALTY("fbpenalty"),
    FBRUN("fbrun"),
    FBSPIRAL("fbspiral"),
    FBTOUCHDOWN("fbtouchdown"),
    FRANKERZ("frankerz"),
    FREAKINSTINKIN("freakinstinkin"),
    FUNGINEER("fungineer"),
    FUTUREMAN("futureman"),
    GAYPRIDE("gaypride"),
    GENDERFLUIDPRIDE("genderfluidpride"),
    GINGERPOWER("gingerpower"),
    GIVEPLZ("giveplz"),
    GRAMMARKING("grammarking"),
    GREENTEAM("greenteam"),
    GUNRUN("gunrun"),
    HASSAANCHOP("hassaanchop"),
    HASSANCHOP("hassanchop"),
    HEYGUYS("heyguys"),
    HOLIDAYCOOKIE("holidaycookie"),
    HOLIDAYLOG("holidaylog"),
    HOLIDAYORNAMENT("holidayornament"),
    HOLIDAYPRESENT("holidaypresent"),
    HOLIDAYSANTA("holidaysanta"),
    HOLIDAYTREE("holidaytree"),
    HOTPOKKET("hotpokket"),
    HSCHEERS("hscheers"),
    HSWP("hswp"),
    HUMBLELIFE("humblelife"),
    IMGLITCH("imglitch"),
    INTERSEXPRIDE("intersexpride"),
    INUYOFACE("inuyoface"),
    ITSBOSHYTIME("itsboshytime"),
    JEBAITED("jebaited"),
    JKANSTYLE("jkanstyle"),
    JONCARNAGE("joncarnage"),
    KAPOW("kapow"),
    KAPPA("kappa"),
    KAPPACLAUS("kappaclaus"),
    KAPPAPRIDE("kappapride"),
    KAPPAROSS("kappaross"),
    KAPPAWEALTH("kappawealth"),
    KAPPU("kappu"),
    KEEPO("keepo"),
    KEVINTURTLE("kevinturtle"),
    KIPPA("kippa"),
    KOMODOHYPE("komodohype"),
    KONCHA("koncha"),
    KREYGASM("kreygasm"),
    LESBIANPRIDE("lesbianpride"),
    LUL("lul"),
    MAU5("mau5"),
    MAXLOL("maxlol"),
    MCAT("mcat"),
    MERCYWING1("mercywing1"),
    MERCYWING2("mercywing2"),
    MIKEHOGU("mikehogu"),
    MINGLEE("minglee"),
    MORPHINTIME("morphintime"),
    MRDESTRUCTOID("mrdestructoid"),
    MVGAME("mvgame"),
    NINJAGRUMPY("ninjagrumpy"),
    NOMNOM("nomnom"),
    NONBINARYPRIDE("nonbinarypride"),
    NOTATK("notatk"),
    NOTLIKETHIS("notlikethis"),
    OHMYDOG("ohmydog"),
    ONEHAND("onehand"),
    OPIEOP("opieop"),
    OPTIMIZEPRIME("optimizeprime"),
    OSFROG("osfrog"),
    PANICBASKET("panicbasket"),
    PANICVIS("panicvis"),
    PANSEXUALPRIDE("pansexualpride"),
    PARTYHAT("partyhat"),
    PARTYPORO("partyporo"),
    PARTYTIME("partytime"),
    PASTATHAT("pastathat"),
    PEOPLESCHAMP("peopleschamp"),
    PERMASMUG("permasmug"),
    PICOMAUSE("picomause"),
    PINKMERCY("pinkmercy"),
    PIPEHYPE("pipehype"),
    PIXELBOB("pixelbob"),
    PJSALT("pjsalt"),
    PJSUGAR("pjsugar"),
    PMSTWIN("pmstwin"),
    POGCHAMP("pogchamp"),
    POOOOUND("poooound"),
    POPCORN("popcorn"),
    PORSCHEWIN("porschewin"),
    POWERUPL("powerupl"),
    POWERUPR("powerupr"),
    PRAISEIT("praiseit"),
    PRCHASE("prchase"),
    PRIMEME("primeme"),
    PUNCHTREES("punchtrees"),
    PUNOKO("punoko"),
    PURPLESTAR("purplestar"),
    RACCATTACK("raccattack"),
    RALPHERZ("ralpherz"),
    REDCOAT("redcoat"),
    REDTEAM("redteam"),
    RESIDENTSLEEPER("residentsleeper"),
    RIPEPPERONIS("ripepperonis"),
    RITZMITZ("ritzmitz"),
    RLYTHO("rlytho"),
    RULEFIVE("rulefive"),
    SABAPING("sabaping"),
    SEEMSGOOD("seemsgood"),
    SERIOUSSLOTH("serioussloth"),
    SHADYLULU("shadylulu"),
    SHAZBOTSTIX("shazbotstix"),
    SINGSMIC("singsmic"),
    SINGSNOTE("singsnote"),
    SMOOCHERZ("smoocherz"),
    SMORC("smorc"),
    SOBAYED("sobayed"),
    SOONERLATER("soonerlater"),
    SQUID1("squid1"),
    SQUID2("squid2"),
    SQUID3("squid3"),
    SQUID4("squid4"),
    SSSSSS("ssssss"),
    STINKYCHEESE("stinkycheese"),
    STONELIGHTNING("stonelightning"),
    STRAWBEARY("strawbeary"),
    SUPERVINLIN("supervinlin"),
    SWIFTRAGE("swiftrage"),
    TAKENRG("takenrg"),
    TBANGEL("tbangel"),
    TEARGLOVE("tearglove"),
    TEHEPELO("tehepelo"),
    TF2JOHN("tf2john"),
    THANKEGG("thankegg"),
    THEILLUMINATI("theilluminati"),
    THERINGER("theringer"),
    THETARFU("thetarfu"),
    THETHING("thething"),
    THUNBEAST("thunbeast"),
    TINYFACE("tinyface"),
    TOMBRAID("tombraid"),
    TOOSPICY("toospicy"),
    TPCRUNCHYROLL("tpcrunchyroll"),
    TPFUFUN("tpfufun"),
    TRANSGENDERPRIDE("transgenderpride"),
    TRIHARD("trihard"),
    TTOURS("ttours"),
    TWITCHLIT("twitchlit"),
    TWITCHRAID("twitchraid"),
    TWITCHRPG("twitchrpg"),
    TWITCHSINGS("twitchsings"),
    TWITCHUNITY("twitchunity"),
    TWITCHVOTES("twitchvotes"),
    UNCLENOX("unclenox"),
    UNSANE("unsane"),
    UWOT("uwot"),
    VOHIYO("vohiyo"),
    VOTENAY("votenay"),
    VOTEYEA("voteyea"),
    WHOLEWHEAT("wholewheat"),
    WTRUCK("wtruck"),
    WUTFACE("wutface"),
    YOUDONTSAY("youdontsay"),
    YouWHY("youwhy"),;

    private static final Map<String, Emote> emoteMap;

    private final String trigger;

    static
    {
        ImmutableMap.Builder<String, Emote> builder = new ImmutableMap.Builder<>();

        for (final Emote emote : values())
        {
            builder.put(emote.trigger, emote);
        }

        emoteMap = builder.build();
    }

    Emote(String trigger)
    {
        this.trigger = trigger;
    }

    BufferedImage loadImage()
    {
        //return ImageUtil.getResourceStreamFromClass(getClass(), this.name().toLowerCase() + ".png");
        return ImageUtil.getResourceStreamFromClass(getClass(),"/" + this.name().toLowerCase() + ".png");
    }

    static Emote getEmote(String trigger)
    {
        return emoteMap.get(trigger);
    }
}