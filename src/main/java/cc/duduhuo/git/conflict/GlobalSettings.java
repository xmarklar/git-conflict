package cc.duduhuo.git.conflict;

import cc.duduhuo.git.conflict.model.MarkColor;
import cc.duduhuo.git.conflict.setting.SettingsService;
import com.intellij.openapi.components.ServiceManager;

/**
 * =======================================================
 * Author: liying - liruoer2008@yeah.net
 * Datetime: 2018/4/22 21:02
 * Description:
 * Remarks:
 * =======================================================
 */
public class GlobalSettings {
    public static MarkColor getMarkColor() {
        return ServiceManager.getService(SettingsService.class).markColor;
    }
}