package com.company.planner.web.screens.session;


import com.company.planner.entity.Session;
import com.haulmont.cuba.gui.screen.*;

@UiController("planner_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}