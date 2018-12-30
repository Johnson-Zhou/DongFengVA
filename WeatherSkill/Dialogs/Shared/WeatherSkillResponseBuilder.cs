using Microsoft.Bot.Solutions.Dialogs;
using Microsoft.Bot.Solutions.Dialogs.BotResponseFormatters;

namespace WeatherSkill
{
    public class WeatherSkillResponseBuilder : BotResponseBuilder
    {
        public WeatherSkillResponseBuilder()
           : base()
        {
            AddFormatter(new TextBotResponseFormatter());
        }
    }
}
