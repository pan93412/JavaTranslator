package tw.pan93412.JavaTranslator.View;

/**
 * 說明頁面
 */
public class HelpScreenActivity {
    public static String activityContent() {
        final String space = "    "; // 4 格縮排 
        final String nlspace = "\n" + space; // newline + space

        return new StringBuilder()
            .append(I18n.i18n("model.HelpScreenActivity.WelcomeTxt1"))
            .append(I18n.i18n("model.HelpScreenActivity.WelcomeTxt2"))
            .append(space + extracted())
            .append(I18n.i18n("model.HelpScreenActivity.CommandList"))
            .append("::next" + nlspace + I18n.i18n("model.HelpScreenActivity.NextCommandDesc"))
            .append("::prev" + nlspace + I18n.i18n("model.HelpScreenActivity.PrevCommandDesc"))
            .append("::to " + I18n.i18n("model.HelpScreenActivity.ToCommandArg") + nlspace + I18n.i18n("model.HelpScreenActivity.ToCommandDesc"))
            .append("::copy" + nlspace + I18n.i18n("model.HelpScreenActivity.CopyCommandDesc"))
            .append("::save" + nlspace + I18n.i18n("model.HelpScreenActivity.SaveCommandDesc"))
            .append("::saveas" + I18n.i18n("model.HelpScreenActivity.FilenameArg") + nlspace + I18n.i18n("model.HelpScreenActivity.SaveasCommandDesc"))
            .append("::load" + I18n.i18n("model.HelpScreenActivity.FilenameArg") + nlspace + I18n.i18n("model.HelpScreenActivity.LoadCommandDesc"))
            .append("::merge" + I18n.i18n("model.HelpScreenActivity.MergeCommandArg") + nlspace + I18n.i18n("model.HelpScreenActivity.MergeCommandDesc"))
            .append(nlspace + I18n.i18n("model.HelpScreenActivity.MergeCommandComment"))
            .append("::exit" + nlspace + I18n.i18n("model.HelpScreenActivity.ExitCommandDesc"))
            .append("::help" + nlspace + I18n.i18n("model.HelpScreenActivity.HelpCommandDesc"))
            .append(I18n.i18n("model.HelpScreenActivity.PromptMsg"))
            .append(":").toString();
    }
	private static String extracted() {
		return I18n.i18n("model.HelpScreenActivity.UsageTxt");
	}
}