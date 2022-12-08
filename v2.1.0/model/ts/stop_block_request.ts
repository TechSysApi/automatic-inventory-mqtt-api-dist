import { UUID } from 'apikana/default-types'
import { DateTime } from 'apikana/default-types'
export interface StopBlockRequest {
    /**
     * The date+timestamp which identifies the point in time when the app requested stopping the current block
     *
     * @format date-time
     */
    stopTimestamp: DateTime

    /**
     * Unique identifier of the sorting center.
     * @maxLength 200
     */
    locationKey: string

    /**
     * The id of the feeding line where the block should be stopped
     *
     */
    feedingLineId: string

    /**
     * The blockId of the block to be stopped. If it is empty, then the machine must stop by feedingLineId.
     */
    blockId?: UUID
}
