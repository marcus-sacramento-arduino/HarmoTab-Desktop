/**
 * This file is part of HarmoTab.
 *
 * @copyright Copyright (c) 2011 HarmoTab
 * @license GPL-3.0
 * 
 * HarmoTab is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *   
 * HarmoTab is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with HarmoTab.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author E. Revert (erevert@harmotab.com)
 */

package harmotab.track.soundlayout;

import harmotab.core.Score;
import harmotab.element.Tempo;
import harmotab.sound.*;
import harmotab.track.Track;


public abstract class SoundLayout {
	
	//
	// Constructeur
	//

	public SoundLayout(Track track) {
		m_track = track;
		m_score = track.getScore();
	}
	
	
	//
	// M�thodes abstraites
	//
	
	public abstract void processSoundsPositionning(SoundSequence sounds);

	
	//
	// M�thodes utilitaires
	//
	
	public int getTrackId() {
		return m_track.getScore().getTrackId(m_track);
	}
	
	public Track getTrack() {
		return m_track;
	}
	
	public int getTempo() {
		return (m_score != null ? m_score.getTempoValue() : new Tempo().getValue());
	}
	
	public Score getScore() {
		return m_score;
	}
	
	
	//
	// Attributs
	//
	
	private Track m_track;
	private Score m_score;
	
}

