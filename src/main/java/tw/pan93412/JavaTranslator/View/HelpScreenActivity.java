package tw.pan93412.JavaTranslator.View;

/**
 * 說明頁面
 */
public class HelpScreenActivity {
    private static I18n i = new I18n();
    public static String activityContent() {
        final String space = "    "; // 4 格縮排 
        final String nlspace = "\n" + space; // newline + space

        /* TODO: I18n */
        return new StringBuilder()
            .append(i.i18n("model.HelpScreenActivity.WelcomeTxt1"))
            .append(i.i18n("model.HelpScreenActivity.WelcomeTxt2"))
            .append(space + i.i18n("model.HelpScreenActivity.UsageTxt"))
            .append(i.i18n("model.HelpScreenActivity.CommandList"))
            .append("::next" + nlspace + i.i18n("model.HelpScreenActivity.NextCommandDesc"))
            .append("::prev" + nlspace + i.i18n("model.HelpScreenActivity.PrevCommandDesc"))
            .append("::to " + i.i18n("model.HelpScreenActivity.ToCommandArg") + nlspace + i.i18n("model.HelpScreenActivity.ToCommandDesc"))
            .append("::copy" + nlspace + i.i18n("model.HelpScreenActivity.CopyCommandDesc"))
            .append("::save" + nlspace + i.i18n("model.HelpScreenActivity.SaveCommandDesc"))
            .append("::saveas" + i.i18n("model.HelpScreenActivity.FilenameArg") + nlspace + i.i18n("model.HelpScreenActivity.SaveasCommandDesc"))
            .append("::load" + i.i18n("model.HelpScreenActivity.FilenameArg") + nlspace + i.i18n("model.HelpScreenActivity.LoadCommandDesc"))
            .append("::merge" + i.i18n("model.HelpScreenActivity.MergeCommandArg") + nlspace + i.i18n("model.HelpScreenActivity.MergeCommandDesc"))
            .append(nlspace + i.i18n("model.HelpScreenActivity.MergeCommandComment"))
            .append("::exit" + nlspace + i.i18n("model.HelpScreenActivity.ExitCommandDesc"))
            .append("::help" + nlspace + i.i18n("model.HelpScreenActivity.HelpCommandDesc"))
            .append(i.i18n("model.HelpScreenActivity.PromptMsg"))
            .append(":").toString();
    }
}