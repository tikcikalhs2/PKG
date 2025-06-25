skor=0
print('1. berapa nilai 5 x 5')
jawaban= input('masukkan jawaban:')

if jawaban=='25':
    print('benar')
    skor=skor+1
else:
    print('Salah')

print('2. berapa nilai 5 + 5')
jawaban= input('masukkan jawaban:')

if jawaban=='10':
    print('benar')
    skor=skor+1
else:
    print('Salah')
print(' ')
print(' ')
print('=================================================')
print('kamu mampu mejawab: ',skor, 'soal dengan benar')
print('Total nilai kamu adalah: ', skor/2*10)
print('=================================================')