//created on 28/07/2025

//extending the Thread

//implements Runnable
package threadsconcept;

class Task extends Thread {
	@Override
	public void run() {// SIGNATURE

		System.out.println("task 1 started");
		for (int i = 100; i <= 199; i++) {
			System.out.print(i + " ");
		}
		Thread.yield();
		System.out.println("\n task 1 done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task 2 started");
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n task 2 done");

	}

}

/*
 *
 * task 1 kicked off
 *
 * task 2 kicked off task 1 started 100 101 102 103 104 105 106 107 108 109 110
 * 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129
 * 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148
 * 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167
 * 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186
 * 187 188 189 190 191 192 193 194 195 196 197 198 199 task 1 done
 *
 * task 3 kicked off task 2 started 300 301 302 303 304 305 306 307 308 309 310
 * 311 312 313 314 200 315 201 202 203 204 205 316 317 318 319 206 207 208 209
 * 210 211 212 320 321 322 323 324 325 326 327 328 329 213 214 215 216 217 218
 * 219 330 331 332 333 334 335 336 337 338 220 221 222 223 224 225 339 340 341
 * 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360
 * 361 362 363 364 365 366 367 368 226 227 228 229 230 231 232 233 234 235 236
 * 237 238 239 240 241 242 369 370 371 243 244 372 373 374 375 376 377 378 245
 * 246 247 248 249 250 251 252 253 254 379 255 256 257 258 259 260 261 262 263
 * 264 380 265 266 267 381 268 269 270 271 382 383 384 385 386 387 388 389 390
 * 391 392 272 273 274 275 276 277 278 279 280 281 393 282 283 394 284 395 285
 * 396 286 397 287 398 288 289 290 291 292 293 294 295 399 task 3 done 296 297
 * 298 299 task 2 done
 *
 * main completed
 *
 */
//NEW;
//RUNNABLE;
//RUNNIMG;
//BLOCKED/WAITING;
//TERMINATED/DEAD;

public class Threads_Basic_Runner1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\n task 1 kicked off");
		Task task1 = new Task();
		task1.setPriority(1);
		task1.start();

		System.out.println("\n task 2 kicked off");

		// task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);

		task2Thread.start();

		// wait for task1 to completed
		// it adds "throws InterruptedException" to main method
		task1.join();
		task2Thread.join();

		System.out.println("\n task 3 kicked off");

		// task3
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n task 3 done");
		System.out.println("\n main completed");
	}

}

//output after thread.join()
//which waits for task to competly execute it
//
//task 1 kicked off

//task 2 kicked off
//task 1 started
//100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199
//task 1 done
//task 2 started
//200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299
//task 2 done

//task 3 kicked off
//300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399
//task 3 done

//main completed
