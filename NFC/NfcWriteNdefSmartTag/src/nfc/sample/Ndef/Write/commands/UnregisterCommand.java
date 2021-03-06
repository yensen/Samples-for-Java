package nfc.sample.Ndef.Write.commands;
/*
* Copyright (c) 2012 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import net.rim.device.api.command.AlwaysExecutableCommand;
import net.rim.device.api.command.ReadOnlyCommandMetadata;
import nfc.sample.Ndef.Write.DetectionListenerManager;
import nfc.sample.Ndef.Write.NfcWriteNdefSmartTagListener;
import nfc.sample.Ndef.Write.ui.TagCreatorScreen;

public class UnregisterCommand extends AlwaysExecutableCommand {

    private DetectionListenerManager _listener_mgr = DetectionListenerManager.getInstance();

    
	public UnregisterCommand(TagCreatorScreen log_screen) {
    }

    public void execute(ReadOnlyCommandMetadata metadata, Object context) {
        NfcWriteNdefSmartTagListener listener = (NfcWriteNdefSmartTagListener) context;
        _listener_mgr.unRegisterListener(listener);
	}

}
