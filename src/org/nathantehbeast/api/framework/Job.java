package org.nathantehbeast.api.framework;

import org.nathantehbeast.api.framework.context.Context;
import org.nathantehbeast.api.framework.context.Provider;

/**
 * Created by Nathan on 12/17/13.
 * http://www.powerbot.org/community/user/523484-nathan-l/
 * http://www.excobot.org/forum/user/906-nathan/
 */

public abstract class Job extends Provider {

    public Job(Context arg0) {
        super(arg0);
    }

    public abstract boolean activate();
    public abstract void execute();
}
