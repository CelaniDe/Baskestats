package DatabaseFakeJson;

import model.Match;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchCRUD
{
    private static String MATCH_JSON_FILE_PATH = "src/json_data/match.json";

    public List<Match> getAllMatches()
    {
        JSONParser parser = new JSONParser();
        List<Match> matches = new ArrayList<>();
        try
        {
            Object obj = parser.parse(new FileReader(MATCH_JSON_FILE_PATH));
            JSONArray matchList = (JSONArray) obj;

            for(int i = 0; i < matchList.size(); i++)
            {
                JSONObject matchObject = (JSONObject) matchList.get(i);
                int id = (int)((long) matchObject.get("id"));
                String date = (String) matchObject.get("date");
                String time = (String) matchObject.get("time");
                String stadium = (String) matchObject.get("stadium");
                Match newMatch = new Match(date,stadium,id,time);
                matches.add(newMatch);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return matches;
    }

    public List<Match> getFutureMatches() {
        List<Match> allMatches = getAllMatches();
        List<Match> futureMatches = new ArrayList<>();

        for(Match match : allMatches)
        {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date nowDate = new Date();
                if(nowDate.before(formatter.parse(match.getDate())))
                {
                    futureMatches.add(match);
                }
            }
            catch (ParseException e)
            {
                System.out.println("Wrong date");
            }

        }

        return futureMatches;
    }

    public List<Match> getPastMatches() {
        List<Match> allMatches = getAllMatches();
        List<Match> futureMatches = new ArrayList<>();

        for(Match match : allMatches)
        {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date nowDate = new Date();
                if(nowDate.after(formatter.parse(match.getDate())))
                {
                    futureMatches.add(match);
                }
            }
            catch (ParseException e)
            {
                System.out.println("Wrong date");
            }

        }

        return futureMatches;
    }

    public List<Match> getTodayMatches() {
        List<Match> allMatches = getAllMatches();
        List<Match> futureMatches = new ArrayList<>();

        for(Match match : allMatches)
        {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date nowDate = new Date();
                if(nowDate.equals(formatter.parse(match.getDate())))
                {
                    futureMatches.add(match);
                }
            }
            catch (ParseException e)
            {
                System.out.println("Wrong date");
            }

        }

        return futureMatches;
    }

    public Match getMatchById(int id)
    {
        List<Match> allMatches = getAllMatches();
        for(Match match : allMatches)
        {
            if(match.getId() == id)
                return match;
        }
        return null;
    }
}
