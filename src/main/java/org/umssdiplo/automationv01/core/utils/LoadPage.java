package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Formulario.Formulario;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static Home homePage() {
        ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getUrlFormulario());
        return new Home();
    }

    public static Formulario navegateFormulario() {
        ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getUrlFormulario());
        return new Formulario();
    }
}
